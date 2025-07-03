import { Routes } from '@angular/router';
import { AboutComponent } from './p1-basic/about/about.component';
import { HomeComponent } from './p1-basic/home/home.component';
import { ProductListComponent } from './p2-children/product/product-list/product-list.component';
import { ProductDetailsComponent } from './p2-children/product/product-details/product-details.component';
import { ProductSearchComponent } from './p2-children/product/product-search/product-search.component';
import { studRoutes } from './p3-childroutes/stud/stud.route';
import { NotfoundComponent } from './p1-basic/notfound/notfound.component';
import { guardRoutes } from './p5-guard/guard.route';

export const routes: Routes = [
    //p1-basic
    { path: '', redirectTo: '/home', pathMatch: 'full' },
    { path: 'home', component: HomeComponent },
    { path: 'about', component: AboutComponent },

    //p2-Children
    {
        path: 'product', children: [
            { path: '', component: ProductListComponent },
            { path: 'details/:id', component: ProductDetailsComponent },
            { path: 'search', component: ProductSearchComponent }
        ]
    },

    //p3-childroutes with lazy component
    { path: 'stud', children: studRoutes },

    //p4-lazy feature 
    {
        path: 'staff', loadChildren: () =>
            import('./p4-lazyfeature/staff/staff.route').then(m => m.staffRoutes)
    },

    //p5-route guards
    { path: 'admin', children: guardRoutes },


    { path: '**', component: NotfoundComponent }
];
