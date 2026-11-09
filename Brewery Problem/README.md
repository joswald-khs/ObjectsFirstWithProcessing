# The Production Control System Problem
_known as "The Brewery Problem"_
source: [ACM](https://dl.acm.org/doi/book/10.1145/3785672)

## Introduction
The Production Control System is composed of an inventory system, a production system, and a recipe library. Each component has specific tasks it must complete successfully. In this assignment, you are responsible for designing a production facility using Java that manages each of these systems to produce something (whether that is beer, tea, soda, or something else is up to you). Each of these systems will need their own subset of classes and methods.

**Note** that each of these systems either relies on information from another system or provides an output that forces the other system to update its data. How do we create an efficient object-oriented system to manage all of the tasks inherent to production?
 
## Program Requirements
Below is a general description of what each “system” should simulate.
* The Production System: monitor the creation of a beverage/product from mixing ingredients all the way to bottling/packaging.
* The Inventory System: monitors beverages/products on hand and all ingredients needed to make beverages/products.
* The Recipe Library: contains instructions for making any given beverage/product that the system produces.

## Restrictions
1. Variables can be defined from a built-in type (as in, a data type that already exists in Java) or can be references to objects created from the classes defined in each design. Imported functionality from external libraries are not allowed.
2. Special meaning should not be ascribed to specific values of variables.
3. Functions or procedures outside of the methods of an object or class should not be used.
4. Avoid using global variables as much as possible (ideally, use none).
5. Methods should (to the best of their ability) provide no more than one item of information. If more than one is provided, then it should be a necessary consequence of the service being performed by that method.

## Scenarios
* Add ingredients to the Inventory: There needs to be a way to track the ingredients on hand in the brewery’s inventory and, based on what beverages are made, subtract ingredients and re-order new ingredients when supply drops below a certain threshold.
* Bottle a batch of beverages: A beverage is done brewing and needs to be bottled. The container that was holding the batch is marked as “dirty” for the next scenario.
* Clean container: A user or client notifies the system that a dirty container has been cleaned, and that action is remembered by the system.
* Make batch: A user or client needs to be able to instruct the system to create a batch of a beverage. They need to be able to indicate the size of the batch (how many servings?), provide a recipe, and then allow the system to verify that enough ingredients are available to complete the task.
* Create Recipe: A user or client should be able to define a new recipe and store it in the library. The recipes should indicate ingredient quantities and how many bottles of the beverage it will produce.
