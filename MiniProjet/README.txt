The library management system application operates as a console-based program, offering distinct functionalities for both administrators and users. 
Upon initiation, users are presented with a menu providing options :
to log in either as an administrator or a regular user. 
Admins have the capability to add, remove, and display books in the library, as well as create events. 
Users, on the other hand, can register, borrow and return books, participate in events, and view their borrowed book history. 
 Users are guided through the application using interactive menus, where they can input their choices to execute specific tasks.

Account Class:

The Account class serves as a base class for both administrators (Admin) and regular users (User).
It manages user credentials (username and password) and includes a method for user registration.
It provides a method for user authentication.

Admin Class (extends Account):

The Admin class represents an administrator with additional functionalities.
Admins can perform operations such as adding, removing, and displaying books in the library.
Admins can also create events and access a menu for various administrative tasks.

User Class (extends Account):

The User class represents a library user with functionalities like borrowing and returning books.
Users can also participate in events and have a library card associated with them.
The class includes a menu for users to interact with the library system.

Book Class:

Library Class:

The Library class manages a collection of books.
It allows adding, removing, and displaying books.

LibraryCard Class:

The LibraryCard class represents a library card associated with a user.
It includes information about the card number, expiration date, and activation status.

BookHistory Class:

The BookHistory class maintains a record of books borrowed by a user.
It includes methods to add and display borrowed books.

CollectionOfEvents Class:

The CollectionOfEvents class manages a collection of events.
It allows adding events and displaying information about them.

Event Class:

The Event class represents an event with attributes like name, date, location, and a unique identifier.
It includes methods for displaying information about the event, adding participants, and checking if the event is full.

Menu Class:

The Menu class handles the main interaction with the library system.
It allows users to choose between admin and user roles and provides respective menus.

