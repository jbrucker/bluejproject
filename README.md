This project contains small, unrelated classes used
to demo subject matter when teaching Java.

## BlueJ Bugs

Using BlueJ 4.10 I encounter intermittent problems with 
the editor screen becoming whited out.  It starts with
a few lines (at location where editing is taking place)
and eventually fills the entire screen.  Closing/reopening
the editor doesn't help, but *other* files can be edited OK.
Restarting BlueJ clears the problem. 

Platform: Ubuntu 16.04 LTS, with Oracle Java 1.8.0_121

Log files: in directory [debug](debug) of this repository.

* 31 Jul 2017: editor whiteout while editing the file `stepik/AdaptiveJava.java`. bluej-debuglog file in `debug` directory.



## BlueJ Wishlist

Support use of `src/` and `bin/` directories, as other IDE do.
Benefits are: a) enable students to switch between IDE,
b) enable instructors to use automatic grading tools that
expect the typical project directory structure.

