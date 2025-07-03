import { Routes } from "@angular/router";
import { StudlistComponent } from "./studlist/studlist.component";
import { StudaddComponent } from "./studadd/studadd.component";

export const studRoutes: Routes = [
    
    {path:'', component:StudlistComponent},
    {path:'add', component:StudaddComponent},
    {path:'edit', loadComponent: () => import('./studedit/studedit.component').then(m => m.StudeditComponent)},

]