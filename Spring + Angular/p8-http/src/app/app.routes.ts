import { Routes } from '@angular/router';
import { ProductFormComponent } from './p1-crud/product-form/product-form.component';
import { ProductListComponent } from './p1-crud/product-list/product-list.component';
import { NotfoundComponent } from './p1-crud/notfound/notfound.component';

export const routes: Routes = [

    { path: 'products', component: ProductListComponent },
    { path: 'products/new', component: ProductFormComponent },
    { path: 'products/:id/edit', component: ProductFormComponent },
    { path: '', redirectTo: '/products', pathMatch: 'full' },
    { path: '**', component: NotfoundComponent }

];
