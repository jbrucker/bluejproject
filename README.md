This project contains small, unrelated classes used
to demo subject matter when teaching Java.

## BlueJ Bugs

Using BlueJ 4.10 I encounter intermittent problems with 
the editor screen becoming whited out.  It starts with
a few lines (at location where editing is taking place)
and eventually fills the entire screen.  Closing/reopening
the editor doesn't help, but *other* files can be edited OK.
Restarting BlueJ clears the problem. 

**Platform**: Ubuntu 16.04 LTS, with Oracle Java 1.8.0_121

**BlueJ Log files**: in directory [debug](debug) of this repository.

* 31 Jul 2017: editor whiteout while editing the file [stepik/AdaptiveJava.java](stepik/AdaptiveJava.java). See debug/bluej-debuglog-20170731.txt.

* 6 Aug 2017: editing the file [Greeter.java](Greeter.java). I tried to type a "System.out.println(...)" over the comment line in main and got a white line. After that, editor became unresponsive.  **I was able to reproduce it**: quit BlueJ and started it again. Edit Greeter.java. Select the entire comment line in main (starting from //) and start typing. Immediately got a whited-out line and editor stopped responding; but able to close the editor and edit other files.
    See log file: debug/bluej-debuglog-20170806.txt and debug/bluej-debuglog-20170806-2.txt  

## BlueJ Wishlist

Support use of `src/` and `bin/` directories, as other IDE do.
Benefits are: a) enable students to switch between IDE,
b) enable instructors to use automatic grading tools that
expect the typical project directory structure.

