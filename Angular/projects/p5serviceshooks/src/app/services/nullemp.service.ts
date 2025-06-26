import { Injectable } from '@angular/core';

@Injectable({
  providedIn: null
})
export class NullempService {

  employees = [
    { id: 101, name: 'John Doe', position: 'Developer' },
    { id: 102, name: 'Jane Smith', position: 'Designer' },
    { id: 103, name: 'Alice Johnson', position: 'Manager' }
  ];

  constructor() { }
}
