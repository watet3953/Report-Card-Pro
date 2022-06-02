For the purposes of the table:  

[x] is a positive integer representing some duplicatible part  
[sn] is the name of an added script  
and [sv] is the name of a value from an added script  

|Type of Component|Purpose                          |Value            |Variable Name    |
|-----------------|---------------------------------|-----------------|-----------------|
|JFrame           |Top Bar                          |N/A              |jFrameTop        |
|JLabel           |Title Text                       |"Report Card Pro"|jLblTitle        |
|JButton          |Save Button                      |"Save"           |jBttnSave        |
|JButton          |Load Button                      |"Load"           |jBttnLoad        |
|JTabbedPane      |Holds the Three Tabs             |N/A              |jTabbedPane      |
|**JFrame (Tab)** |**Holds the Input Tab**          |**"Input"**      |**jFrameInput**  |
|JTextField       |Text Field for First Name        |"First Name"     |jTFNameFirst     |
|JTextField       |Text Field for Last Name         |"Last Name"      |jTFNameLast      |
|JTextField       |Text Field for Semester          |"Semester"       |jTFSemester      |
|JTextField       |Disabled Field for Average       |"Average"        |jTFAverage       |
|JTextField       |Text Field for Student ID        |"Student ID"     |jTFID            |
|JFrame           |dupl panel for class data        |N/A              |jFrameClass[x]   |
|JTextField       |Text Field for Class Name        |"Class [x]"      |jTFClass[x]      |
|JTextField       |Text Field for Class Mark        |"Mark [x]"       |jTFMark[x]       |
|JTextField       |Text Field for Class Credit      |"Credit [x]"     |jTFCredit[x]     |
|JTextField       |Disabled Field for Class Average |"Average [x]"    |jTFAverage[x]    |
|JTextField       |Text Field for Class Attendance  |"Attendance [x]" |jTFAttendance[x] |
|JTextField       |Text Field for Teacher Comments  |"Comments [x]"   |jTFComments[x]   |
|JButton          |Remove Class Button              |"Remove Class"   |jBttnRemove[x]   |
|**JFrame (Tab)** |**Holds the Process Tab**        |**"Process"**    |**jFrameProcess**|
|JFrame (Bordered)|Contains a single "script"'s I/O |"[sn]"           |jFrame[sn]       |
|JTextField       |Holds a value that can be input  |"[sv]"           |jTF[sn][sv]      |
|JButton          |runs the "script" with inputs    |"Run Script"     |jBttnRun[sn]     |
|JButton          |Allows Scripts to be attached    |"Add Script"     |jBttnAddScript   |
|**JFrame (Tab)** |**Holds the Print Tab**          |**"Print"**      |**jFramePrint**  |
|JButton          |Print/Save Button                |"Print / Save"   |jBttnPrintSave   |
|JLabel           |Format Type Label                |"Format Type:    |jLblFormatType   |
|JComboBox        |List of Print Formats            |N/A              |jCBFormats       |
|JButton          |Saves Format Layout              |"Save Format"    |jBttnSaveFormat  |
|JFrame           |Holds the Preview for the Format |N/A              |jFramePreview    |


Function Pseudocode:    


-Retrieving Data    


(assumes specific file already located)  
load file into scanner  
for each value in first row  
  look for variable in code, if not found then skip (possibly throw soft error)  
  store variable reference  
for each value next row  
  compare position in row to variable reference  
  if variable reference is good, set variable to value  
do not read subsequint lines, exit after second line    

-Lookup student by name

(could be more efficient with a lookup table, will be considered if sufficiently slow)  
for each student file  
  read in name fields from file  
  compare to requested name  
  if the same, return the id of the file  
if no name is the same, return a 0  

-Adding student to file

get student id  
if a file already exists under the id name, push prompt to screen  
if prompt accepted or file doesn't exist  
  for each variable field name to be uploaded
    write to file's first line, seperated by comma  
  for each variable field to be uploaded  
    write to file's second line, in the same order as variable names  
return indicator of success (boolean, true false)  


-modifying student data

(user loads data (see retrieving data)  
(user modifies text fields)  
(user saves data (see adding student to file)  

-calculate average

for each file  
  if a filter variable exists, check file for filter variable, if not included then discard file from loop  
  store file ID in array
  get file's mark field for class, write to arraylist (possibly rolling average if too resource intensive)  
  calculate average from all values in arraylist
  write average value to all file IDs in array
