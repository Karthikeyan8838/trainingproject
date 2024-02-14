# trainingadministrationportal
PROJECT DESCRIPTION:

The Training Management Portal is a web-based tool empowering training coordinators to efficiently organize and oversee courses, trainers, and training schedules. It allows the creation, editing, and removal of Courses, Student and Trainer details, along with scheduling, modification, and deletion of Training sessions. Administration can manage Course attributes like Name, Description, Category, and Trainer details including Name, Qualification, and Experience. The system ensures data integrity by preventing deletions when upcoming Trainings are scheduled and avoids duplicate Training schedules.

ENTITES:

Admin :Add Student, Trainer and Manages courses and monitor enrollment and schedules.

Course :Contains detailed information about each course.

Training Schedule :Includes details about the schedule for each course.

Enrollment :Records user enrollment in specific courses.

Student : Access the portal using their account credentials and Enrolls in available courses.

Trainer : Access the portal using their account credentials and Manages their profile Information.

Architecture – Components Overview

Browser - Initiates user request 
Controller - Processes and managers user request
Model - Represents application data and business logic
View - Renders user interface components
Database - Stores and manages application data
