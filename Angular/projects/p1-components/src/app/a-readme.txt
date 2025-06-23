To create a component from workspace:
    \Ng19WS>ng g c comp1 --project=p1-components

To add comp1 in the appcomponent
    app.component.ts =>   imports: [RouterOutlet, Comp1Component],
    app.component.html => <app-comp1></app-comp1>

To create a component within specific projects app folder
    \Ng19WS\projects\p1-components\src\app>ng g c comp2

commands to create component
    ng generate component comp1
    ng g c comp1

    ng g c comp1 --inline-template
    ng g c comp1 -t

    ng g c comp1 --inline-style
    ng g c comp1 -s

    ng g c comp1 --skip-tests
    ng g c comp1 -T
    
    ng g c comp1 --inline-template --inline-style --skip-tests
    ng g c comp1 -t -s --skip-tests
    
    
    
    
    