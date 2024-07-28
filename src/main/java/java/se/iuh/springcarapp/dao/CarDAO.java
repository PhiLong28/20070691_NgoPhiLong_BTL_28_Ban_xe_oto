package java.se.iuh.springcarapp.dao;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate; 
import org.springframework.jdbc.core.RowMapper;
import java.se.iuh.springcarapp.model.Car;

public class CarDAO {
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Car> getAllCars(){
		List<Car> carList = new ArrayList<Car>();
		String sql = "SELECT * FROM ListInfoCar";
		carList = template.query(sql, new RowMapper<Car>() {
			@Override
			public Car mapRow(ResultSet rs, int rowNum) throws SQLException { 
				String carID = rs.getString(1);
				String carName = rs.getString(2);
				double price = rs.getDouble (3);
				int modelYear = rs.getInt(4);
				String carDescription= rs.getString(5);
				String imageURL= rs.getString(6);
				Car car = new Car(carID, carName, price, modelYear,
		carDescription, imageURL);
				return car;
		}
	
	});
		return carList;
	}
	public boolean addNewCar(Car car) {
		String sql = "INSERT INTO ListInfoCar VALUES (?,?,?,?,?,?)"; 
		int result = template.update(sql
				, new Object[] {
						car.getCarID()
						,car.getCarName() 
						,car.getPrice() 
						,car.getModelYear() 
						,car.getCarDescription() 
						,car.getImageURL()});
			return result > 0;
		}
		public boolean deleteCar(String carID) {
			String sql = "DELETE FROM ListInfoCar WHERE carID =?"; 
			int result = template.update(sql, new Object[] {carID}); 
			return result > 0;
		}
}
