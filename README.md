# IV1350.Seminar3

This is my solution for the third seminar for the course Object-Oriented Design (IV1350), at KTH The Royal Institute of Technology.

## The Design

The design consists of one class diagram and five interaction diagrams.

### The class diagram

The class diagram shows all packages, startup, view, controller, model and integration.
Each package consists of propiate classes that should be in that package. Example integration has the classes that takes care of external calls like databases and other systems.

![The Class Diagram](https://github.com/sebastian-porling/IV1350.Seminar3/blob/master/img/CD_FINAL.png)

### The main operation

Initializes all the necessery classes to start the application. The catalog creator initializes the catalogs, the system creator initializes the extarnal systems. We the initialize the printer and add these to the Controller. The controller then initialized the cash register. We then add the controller to the view.

![The main operation](https://github.com/sebastian-porling/IV1350.Seminar3/blob/master/img/main_FINAL.png)

### The "start new sale" operation

Initializes a new sale object which initializes a total object. 

![The "start new sale" operation](https://github.com/sebastian-porling/IV1350.Seminar3/blob/master/img/startNewSale_FINAL.png)

### The "register item" operation

With the entered item identifier (a string), we check if it exists in our database. If it does we will add it to our sale, where we will add it to a list. If it exists in the list we will increase the quantity of that item. We will then update the running total. We will then return a string which consists of information about the entered item and the current running total.

![The "register item" operation](https://github.com/sebastian-porling/IV1350.Seminar3/blob/master/img/registerItem_FINAL.png)

### The "discount" operation

With the entered customer identification we will get the discount from our database. If the customer doesn't exist we will return a discout of zero. We will the apply this discount to our sale object which will apply it to the total.

![The "discount" operation](https://github.com/sebastian-porling/IV1350.Seminar3/blob/master/img/discount_FINAL.png)

### The "pay" operation

With the entered paid amount we will make a payment object, which consists of the total and the paid amount. With this payment we will add it to the cash register to update its balance. We will then send the sale information to the external systems. We will then make a receipt and send it to the printer. We will then return a string with the change.

![The "pay" operation](https://github.com/sebastian-porling/IV1350.Seminar3/blob/master/img/pay_FINAL.png)

### Changes

There have been some changes that can be read [here.](https://github.com/sebastian-porling/IV1350.Seminar3/blob/master/CHANGES.md)
