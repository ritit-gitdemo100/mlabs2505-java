import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RootstudService {

   students = [
    { id: 1, name: 'Bala', age: 26 },
    { id: 2, name: 'Ganesh', age: 25 },
    { id: 3, name: 'Durga', age: 24 }
  ];

  constructor() { }
}
