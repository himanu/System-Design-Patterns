# Abstract Factory Design Pattern
1. It is used when we need to create families of objects.
2. Objects in each family are compatible with each other.
3. And we want to create families of objects i.e objects which are compatible with each other.
4. **Note** These related class don't need to have common interface or class.

## Example GUI Components
1. GUI components are like button, cursor etc.
2. Now mac button is only compatible with mac cursor. Similarly for windows and linux.
3. So when we create a mac button then we only want to create a mac cursor.
4. **The family type is decided when we start our application, this info is mainly stored in environment variables**

**Client is only exposed to the abstract interfaces**,
### If not client then who creates the actual factory objects? 
The application creates a concrete factory object at the initialization stage. Just before that, the app must select the factory type depending on the configuration or the environment settings
