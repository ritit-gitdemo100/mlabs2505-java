service
--------
    A service in Angular is a class that provides 
    reusable logic, data, or functionality 
    that can be shared across components and other parts of the application.

    Angular promotes separating concerns:
        Components handle the UI (view).
        Services handle the logic and data (like APIs, state, calculations, etc).

To create a service from workspace:
    \src\app>ng g s Employee

To create it within a folder "services"
    \src\app>ng g s services/Employee

providedIn: root
    Angular automatically registers the service in the application's root injector.
    You do not need to add it to any providers array manually.
    The service becomes a singleton — one shared instance is used across the entire app.
    @Injectable({
    providedIn: root
    })


providedIn: null
    You can use it to provide the service in a specific component only
    Manual registration is required using the providers array in:
    A component Or a bootstrapping function (bootstrapApplication)
    @Injectable({
    providedIn: null
    })

