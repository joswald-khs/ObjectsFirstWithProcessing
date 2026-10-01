# Burger Class FRQ
_Code.org CSA Unit 2 FRQ_

The food truck menu consists of a variety of `MenuItem` subclasses. Your task will be to write the `Burger` class, which extends the `MenuItem` superclass, includes a constructor and the following methods: 

* A `getCheeseStatus()` method, which should return `true` if the `Burger` object has cheese and `false` if the `Burger` object does not have cheese. 
* A `setCheeseStatus()` method, which accepts a `boolean` parameter to update the attribute that describes if the `Burger` object has cheese or not. 
* A `toString()` method, which returns a `String` containing the text "Thank you for visiting our food truck. Enjoy your (name of Burger object)."

The following table contains sample code execution and the corresponding results. 

|Statements and Expressions|Value Returned (blank if no value)|
|--------------------------|----------------------------------|
|`Burger burger1 = new Burger("double burger",5.75,true);`||
|`burger1.getPrice();`|5.75|
|`burger1.getName();`|"double burger"|
|`burger1.getCheeseStatus();`|true|
|`burger1.setCheeseStatus(false);`||
|`burger1.getCheeseStatus();`|false|
|`burger1.toString();`|"Thank you for visiting our food truck. Enjoy your double burger.|
