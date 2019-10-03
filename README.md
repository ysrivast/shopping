# shopping

this application is for calculation of checkout bill and apply promotions according to the customer profile.

**Bill** represnt the bill entitty with amount , user and cart

**Product** represnt product detail with different type

**User** represnt customer with type and system

**PriceCalculator** is resposible to apply promotion by using Factory method of Promotion



**Input** we pass bill object in the Price Calculator , it process the bill. Fisrt it will apply pormotion according to User.
we have calculate total of bill by excluding Greocery item type.  and then we apply additional promotion.

**Output** we gate the actual payable price by the customer
