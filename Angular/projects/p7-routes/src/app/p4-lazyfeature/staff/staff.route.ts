import { Routes } from "@angular/router";

export const staffRoutes: Routes = [
    {
        path: '', loadComponent: () => import('./stafflayout/stafflayout.component').then(m => m.StafflayoutComponent),
        children: [
            { path: '', loadComponent: () => import('./stafflist/stafflist.component').then(m => m.StafflistComponent) },
            { path: 'add', loadComponent: () => import('./staffadd/staffadd.component').then(m => m.StaffaddComponent) },
            { path: 'edit', loadComponent: () => import('./staffedit/staffedit.component').then(m => m.StaffeditComponent) },
        ]
    },
]