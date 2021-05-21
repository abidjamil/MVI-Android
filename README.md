# android-mvi-architecture

MVI stands for Model-View-Intent. MVI is one of the newest architecture patterns for Android, inspired by the unidirectional and cyclical nature of the Cycle.js framework.

MVI works in a very different way compared to its distant relatives, MVC, MVP or MVVM. The role of each MVI components is as follow

# MVI Boilerplate

This project is a native android boilerplate that can be used to kickstart a mobile application.

The boilerplate provides **an MVI architecture optimized for building android mobile applications** through separation of concerns between the UI and business logic and signle source of truth. It is extremely documented so that each piece of code that lands in your application can be understood and used.

```
If you love this boilerplate, give us a star, you will be a ray of sunshine in our lives :)
```

## Architecture

The driving goal of the architecture of the boilerplate is separation of concerns and single source of truth. Namely:

- **Model**
- 
    Model represents a state. Models in MVI should be immutable to ensure a unidirectional data flow between them and the other layers in your architecture.
    

- **View**.

    Like in MVP, Interfaces in MVI represent Views, which are then implemented in one or more Activities or Fragments.
    
   
- **Intent**.

    Intent represents an intention or a desire to perform an action, either by the user or the app itself. For every action, a View receives an Intent. The Presenter observes the Intent, and Models translate it into a new state.


## Directory layout

- [`App/adapter`](App/adapter): Adapters for recyclerview / spinners
- [`App/app`](App/app): Architectural Base classes for app level configurations
- [`App/data`](App/data): Local Database, Repoistory, and Models.
- [`App/intents`](App/intents): Intents classes to complete , MVI
- [`App/neworkInterface`](App/networkInterface): Network related interface and configurations.
- [`App/states`](App/states): States classes to complete , MVI
- [`App/utilis`](App/utilis): Utilis classes
- [`App/view`](App/Sagas): Activities, Fragments
- [`App/viweModels`](App/Services): ViewModels


For more information on each directory,

## Updates

The boilerplate will follow new releases as soon as libraries and tools used here are compatible.

## Requirements


## Using the boilerplate

To create a new project using the boilerplate:

- clone this repository
- remove the previous git history: `rm -rf .git/`

You can now create a new git repository for your project (using `git init`) and create the first commit.

## License

This project is released under the [MIT License](LICENSE).

## Contributions 
Contributions, issues and feature requests are welcome.
Feel free to check [issues](https://github.com/abidjamil/MVI-Android/issues "issues") page if you want to contribute.

## About Me
My name is Abid Jamil from Pakistan, I am Senior Software Engineer at Nextbridge Ltd Pakistan. I have expertise in Native Android | React - Native | IOS | Android | Java | Kotlin | Javascript | MVVM | MVP | RxJava | Dagger | Material Design | Live Data | Data Binding. Futhermore, I am open source contribution and computer science researcher. I have published 17 research paper which is avaiable on [Google Scholar Profile](https://scholar.google.com/citations?user=sl7oXNsAAAAJ&hl=en "Google Scholar Profile").  I have delivered many talks in different national and International universities around the globe. 

- Github : [abidjamil ](https://github.com/abidjamil "abidjamil ")
- Youtube : [Abid Jamil](https://www.youtube.com/channel/UCzhsWt46D-oOX5VyubOS3jQ "Abid Jamil")
- Facebook : [Abid Jamil](http://www.facebook.com/chabidgill "Abid Jamil")
