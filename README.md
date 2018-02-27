# Android and Kotlin MVVM example

Components used:

- ViewModel
  - Decouples bussines logic from fragment/activity
  - Persists data trough configuration changes
  - Fetches data from repository
  - Exposes LiveData objects to activity/fragment
  
- Dagger2
  - Easy unit and integration testing
  - Removes tight coupling
  - Reduces object creation complexity
  
- Retrofit
  - Consuming REST apis with ease
  
- LiveData
  - Provides lifecycle aware data
  - Provides an easy to use observer pattern
  - Removes the need for heavy RxJava library
  
  TODO:
  - implement ROOM
  - enable PeopleRepository to fetch either from localDB(room) or from remote api
  - explore LifecycleObservers and kotlin coroutines
  - use different dagger scopes

