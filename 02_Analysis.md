 a) What is its title?
 Report Card Pro
 
 b) What will the project achieve?
Providing an easy way to store, process, modify, and print marks for report cards.

c) What is the user required to do?
Input marks, class names, and student names.

d) What are some of the given facts?
Each student has a name and four classes, which each have a grade and a mark

The program should be hopefully intuitive enough that basic use will be obvious to the user, but for more complicated things such as potential conditional support a manual may be required.

Global variables will likely not be needed between "tabs", data can be loaded during tab switch.

### Three Tabs


**Input**

The screen most used by teachers


Inputs:

-Name (First and Last, maybe middle or other name data)

-Student Grade (stored as a float)

-Class (Class code and/or name)

-Attendance (?)

-Teacher Comment


Other fields able to be added during use?


Functions:

-on button press, given a file, read data into the proper boxes

-on button press, given data from boxes, write data into a file

-autofill capabilities for some boxes?


**Process**

Doing calculations and bulk edits of files.


-Calculate Average

-Edit all instances of a class

-Allow users to load their own scripts to modify files (?)

Functions:

-on button press, given a set of files with a shared class name, return the average grade of the class

-on button press, given a set of files, possibly filtered by a property name, edit and save a property on all files.

**Print**

Handles the styling and printing of report cards


-Select (and edit?) formats

-Written conditional support for user? (when mark less than 50, write X)


Functions:

-on button press, given a file, read it in and apply it to a format

-on button press, Given an edited format, save it to a format specific file (?)

-on button press, given a file and a format (possibly already loaded into the program), convert it to a printable format and save/print. (via openable menu)

**File**
Comma Seperated Value (.csv) file

Loaded on Load press, written locally to variables, comitted to file on Save press.


File name is student ID
FirstName, 
LastName, 
Average, 
Semester, 
Class1, 
Mark1, 
Credit1,
Average1, 
Attendance1(?)

A Vague outline of the things required by each section
![image](https://user-images.githubusercontent.com/106386185/170998110-5ff3b5ec-bcdb-43bc-937d-3804c8e392f0.png)

A rough outline of the layout shared between all tabs
![image](https://user-images.githubusercontent.com/106386185/171179999-59314142-c874-4a35-b00f-1593bf12793e.png)

The Input Tab
![image](https://user-images.githubusercontent.com/106386185/171401623-845212f2-1774-4b7d-955f-4d5dfbd72d5c.png)

The Process Tab
![image](https://user-images.githubusercontent.com/106386185/171180548-4f0f37ab-36f3-4caf-84ff-daad93a05323.png)

The Print Tab
![image](https://user-images.githubusercontent.com/106386185/171180789-8b5b3595-c9c5-4361-aa4b-a65652a8a355.png)

