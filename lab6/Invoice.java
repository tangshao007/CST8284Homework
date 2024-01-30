
/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:19 Nov
 * Description: Lab6 practice of Exception Handling
 */


/**
 * This is the Invoice class which IMPLEMENTS the Payme interface
 * It is an UNRELATED CLASS to the Programmer superclass
 */
public class Invoice implements Payme {

private String partNumber; 
private String partDescription;
private int quantity;
private double pricePerItem;


 /**
  *Constructs an invoice with part number, description , quantity and price per item.
  * @param part the part number of the item in the invoice
  * @param description the description of the item in the invoice
  * @param count the quantity of the item in the invoice
  * @param price the price of per item
  */
 public Invoice(String part, String description, int count,
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}


 //set part number
 public void setPartNumber(String part) {
 partNumber = part; // should validate
}


 //get part number
 public String getPartNumber() {
 return partNumber;
}

//set description
public void setPartDescription(String description) {
 partDescription = description; // should validate
}

//get description
public String getPartDescription() {
 return partDescription;
}

//set quantity
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

//get quantity
public int getQuantity() {
 return quantity;
}

//set price per item
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}

//get price per item
public double getPricePerItem() {
 return pricePerItem;
}


 /**
  * This portion of code output the details of the invoice
  * @return String representation of Invoice object
  */
 @Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
}



 /**
  * This portion of code calculate the payment due of the invoice
  * It required to carry out contract with interface Payme
  * @return payment due of the invoice
  */
 @Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); // calculate total cost
}
}


