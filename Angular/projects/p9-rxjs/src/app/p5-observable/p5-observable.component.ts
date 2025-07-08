import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p5-observable',
  imports: [CommonModule],
  template: `
    <h3>User List</h3>
    <ul>
      <li *ngFor="let user of users">{{ user.name }}</li>
    </ul>
  `,
  styles: ``
})
export class P5ObservableComponent {

  users: any[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get<any[]>('https://jsonplaceholder.typicode.com/users')
      .subscribe(
        data => { this.users = data; }
      );
  }

}
