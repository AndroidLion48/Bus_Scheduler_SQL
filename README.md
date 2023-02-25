# Bus Scheduler App

The Bus Scheduler app displays a list of bus stops and arrival times. Tapping a bus stop on the first screen will display a list of all arrival times for that particular stop.

The bus stops are stored in a Room database. Schedule items are represented by the `Schedule` class and queries on the data table are made by the `ScheduleDao` class. The app includes a view model to access the `ScheduleDao` and format data to be display in a list, using `Flow` to send data to a recycler view adapter.

![Screenshot 2023-02-24 180504](https://user-images.githubusercontent.com/92341925/221332032-0581c4eb-92da-4eae-ad63-dfcf30ff43dc.png)
![Screenshot 2023-02-24 180646](https://user-images.githubusercontent.com/92341925/221332035-7d03fda9-dd44-4741-8010-66120f3bd824.png)

# In summary:

- Tables in a SQL database are represented in Room by Kotlin classes called entities.

- The DAO provides methods corresponding to SQL commands that interact with the database.

- ViewModel is a lifecycle aware component used to separate your app's data from its view.

- The AppDatabase class tells Room which entities to use, provides access to the DAO, and performs any setup when creating the database.

- ListAdapter is an adapter used with RecyclerView that is ideal for handling dynamically updated lists.

- Flow is a Kotlin feature for returning a stream of data and can be used with Room to ensure the UI and database are in sync.
