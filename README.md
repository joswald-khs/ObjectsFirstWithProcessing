# ObjectsFirstWithProcessing

This project was inspired by my love of [Processing](https://processing.org/), [BlueJ](https://bluej.org/), and the [_ObjectsFirst_](https://www.bluej.org/objects-first/) textbook, but frustrated by what I found in terms of marrying all three.

Good starting point:
https://happycoding.io/tutorials/java/processing-in-java

## Making it Work

You will need to add the `core` `.jar` file to your developmenet environment to get this to work. My teaching work is focused on using BlueJ, so I'll provided some resources here for that. 

I've added `core-4.4.7.jar` to this repository, but you can download different versions wherever you can find them on the internet _or_ if you're using MacOS, you can fish your own out by right-clicking on the Processing icon in your Applications folder, selecting "Show Package Contents" and then drilling down: Contents > App and then scrolling through the mess. You'll notice a bunch of extra stuff in between the version and the `.jar`, which is, I assume, the MacOS code-signing these files. I just deleted the excess. 

Once you have the `.jar` file, you need to add it to BlueJ using their [instructions](https://bluej.org/faq.html#faq_How_do_I_use_custom_class_libraries__JARs__)

## Technical Details
Processing works by preprocessing the Java that you write in the Processing Development Environment (PDE) and shoving everything into a new class that extends the `PApplet` object. `PApplet` contains all the Processing methods, so we need it to do anything. When you write classes in Processing, they end up as _inner classes_ which does two things. It makes the syntax cleaner (which is better for newer programmers) and makes working in an object-oriented way more difficult beyond trivial use cases. 

What I've attempted to do, using [this](https://happycoding.io/tutorials/java/processing-in-java) as a starting point is to extend `PApplet` with `Canvas` to create a similar 'shell' to operate in. But, instead of explicitly passing a reference to the `PApplet` object, I am instead employing the singleton pattern to create a single `Canvas` object, coupled with an explicit inner class that holds a reference to that object. This inner class is meant to be extended and the `Canvas` object can be referenced via the `sketch` property. 

