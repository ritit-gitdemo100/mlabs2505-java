import { Routes } from "@angular/router";
import { LoginComponent } from "./login/login.component";
import { ProfileComponent } from "./profile/profile.component";
import { AddpaymentComponent } from "./payment/addpayment/addpayment.component";
import { ListpaymentComponent } from "./payment/listpayment/listpayment.component";
import { authGuard } from "./guards/auth.guard";
import { childGuard } from "./guards/child.guard";
import { deactivateGuard } from "./guards/deactivate.guard";


export const guardRoutes: Routes = [

    { path: '', redirectTo: 'login', pathMatch: 'full' },
    { path: 'login', component: LoginComponent },
    {
        path: 'profile',
        component: ProfileComponent,
        canActivate: [authGuard],
        canActivateChild: [childGuard],
        children: [
            { path: 'payment/add', component: AddpaymentComponent, 
                canDeactivate: [deactivateGuard] },
            { path: 'payment/list', component: ListpaymentComponent },
        ]
    },
    { path: '**', redirectTo: 'login' },

]