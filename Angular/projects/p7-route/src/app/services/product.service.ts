import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() { }

  products = [
    { id: 1, name: 'Laptop', amount: 1200 },
    { id: 2, name: 'Phone', amount: 800 },
    { id: 3, name: 'Tablet', amount: 500 },
    { id: 4, name: 'Monitor', amount: 300 },
    { id: 5, name: 'Keyboard', amount: 100 }
  ];

  getAll(){
    return this.products;
  }

  getById(id:number){
    return this.products.find(p => p.id == id);
  }
}
