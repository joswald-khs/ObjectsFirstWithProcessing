# Unit 1

Based off of the first chapter of [_Objects First with BlueJ_](https://www.bluej.org/objects-first/) but using [Processing](https://processing.org/) as the rendering engine. 

This code contains several shape objects that ultimately use their `draw` method to call the Processing functions. The objects have a similar suite of methods that allow for transformation of the objects. 

## Usage
To use this as though you were in the Processing environment you need to run the `main(String args[])` function on the `Canvas` class (it should be near the top of the list).

> [!WARNING]
> You should not instantiate a `Canvas` object. See technical details below.

After running `main`, you can then instantiate the shape objects and interact with them in BlueJ, or you can write the same code inside of the typical methods in `Canvas` (`settings`, `draw`, `setup`, the event handlers, etc.).

## Technical Details
Processing works by preprocessing the Java that you write in the Processing Development Environment (PDE) and shoving everything into a new class that extends the `PApplet` object. `PApplet` contains all the Processing methods, so we need it to do anything. When you write classes in Processing, they end up as _inner classes_ which does two things. It makes the syntax cleaner (which is better for newer programmers) and makes working in an object-oriented way more difficult beyond trivial use cases. 

What I've attempted to do, using [this](https://happycoding.io/tutorials/java/processing-in-java) as a starting point is to extend `PApplet` with `Canvas` to create a similar 'shell' to operate in. But, instead of explicitly passing a reference to the `PApplet` object, I am instead employing the singleton pattern to create a single `Canvas` object, coupled with an explicit inner class that holds a reference to that object. This inner class is meant to be extended and the `Canvas` object can be referenced via the `sketch` property. 
