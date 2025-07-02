import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { NotfoundComponent } from './pages/notfound/notfound.component';
import { ProductListComponent } from './pages/product/product-list/product-list.component';
import { ProductDetailsComponent } from './pages/product/product-details/product-details.component';
import { ProductSearchComponent } from './pages/product/product-search/product-search.component';

export const routes: Routes = [
    {path:'', redirectTo:'/home', pathMatch: 'full' },
    {path:'home', component:HomeComponent},
    {path:'about', component:AboutComponent},

    {path:'product', children : [
        {path:'', component: ProductListComponent},
        {path:'details/:id', component: ProductDetailsComponent},
        {path:'search', component:ProductSearchComponent}
    ]},


    {path:'**', component:NotfoundComponent}
];
