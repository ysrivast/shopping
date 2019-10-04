# shopping

this application is for calculation of checkout bill and apply promotions according to the customer profile.

**Bill** represnt the bill entitty with amount , user and cart

**Product** represent product detail with different type

**User** represent customer with type and system

**PriceCalculator** is responsible to apply promotion by using Factory method of Promotion.It is implemented using Factory Design pattern which take User object and based on user it returns aplicable promotion.



**Input** we pass bill object in the PriceCalculator , it process the bill. First it will apply promotion according to User.
It calculates total of bill by excluding Greocery item type.  and then we apply additional promotion.

**Output** we get the actual payable price paid by the customer
