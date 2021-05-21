package edu.xcdq.dao;

import edu.xcdq.bean.Customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;


/**
 * 	将用户的数据保存到文件中
 * @author merlin
 *
 */
public class CustomerDao {

	private File clients = new File("clients.txt");
	
	{
		if( !clients.exists() ) {
			try {
				clients.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public Map<String, Customer> query() {
		Map<String, Customer> data = new HashMap<String, Customer>();
		
		if( clients.length() == 0 ) {
			return data;
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(clients))) {

			data = (Map<String, Customer>) ois.readObject();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return data;
	}
	
	
	
	public void update(Map<String, Customer> data) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(clients, false))) {
			oos.writeObject(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
