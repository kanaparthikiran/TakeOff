/**
 * 
 */
package com.bigdata.nosql;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * @author kkanaparthi
 *
 */
public class NOSQLClientTest {


	
	//db.inventory.find( {} )

////db.inventory.find( { status: { $in: [ "A", "D" ] } } )
//	db.inventory.find( { status: "D" } )
	///db.inventory.find( { status: "A", qty: { $lt: 30 } } )
///db.inventory.find( { $or: [ { status: "A" }, { qty: { $lt: 30 } } ] } )
//db.inventory.insertMany( [
//	   { item: "journal", instock: [ { warehouse: "A", qty: 5 }, { warehouse: "C", qty: 15 } ] },
//	   { item: "notebook", instock: [ { warehouse: "C", qty: 5 } ] },
//	   { item: "paper", instock: [ { warehouse: "A", qty: 60 }, { warehouse: "B", qty: 15 } ] },
//	   { item: "planner", instock: [ { warehouse: "A", qty: 40 }, { warehouse: "B", qty: 5 } ] },
//	   { item: "postcard", instock: [ { warehouse: "B", qty: 15 }, { warehouse: "C", qty: 35 } ] }
//	]);

	
	//db.inventory.find( { "instock": { warehouse: "A", qty: 5 } } )
//db.inventory.find( { 'instock.qty': { $lte: 20 } } )

	/**
	 * 
	 */
	private void getNoSQLConnection() {
		MongoClient mongoClient = null;
		try {
			//mongoClient = new MongoClient("localhost", 27017);
			
//			DB database = null;
			//SeverAddress serverAddress = mongoClient.getAddress();
			//
		//	DB db = mongoClient.getDB("database name");

			mongoClient = new MongoClient();
			mongoClient.getDatabaseNames().forEach(System.out::println);
			
			DB database = mongoClient.getDB("myMongoDb");
			
			DBCollection collection = database.getCollection("customers");
			
			
			BasicDBObject document = new BasicDBObject();
			
			document.put("name", "Kiran");
			document.put("company", "Apple");
			
			collection.insert(document);
			
			BasicDBObject query = new BasicDBObject();
			
			query.put("name", "Kiran");
			
			DBCursor cursor = collection.find(query);
			 
			if(cursor!=null) {
				while(cursor.hasNext()) {
					
					DBObject dbObject =  cursor.next();
					System.out.println(" The Mongo DB Obejct"
							+ " is "+ dbObject);
				}
			}
			
			collection.remove(query);
			
			if(cursor!=null) {
				while(cursor.hasNext()) {
					
					DBObject dbObject =  cursor.next();
					System.out.println(" The Mongo DB Obejct"
							+ " is "+ dbObject);
				}
			}
			
			System.out.println(" Updated database row collection.getCount();  "+collection.getCount());
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(mongoClient!=null) {
					mongoClient.close();
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}

		//boolean auth = database.authenticate("username", "pwd".toCharArray());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NOSQLClientTest client = new NOSQLClientTest();
		client.getNoSQLConnection();
	}

}
