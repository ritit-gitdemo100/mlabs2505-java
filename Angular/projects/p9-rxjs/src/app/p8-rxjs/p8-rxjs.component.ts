import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { tap, catchError, of } from 'rxjs';

@Component({
  selector: 'app-p8-rxjs',
  imports: [CommonModule],
  template: `
      <h3>User List</h3>
      <ul>
        <li *ngFor="let user of users">
          {{ user.name }} - ({{ user.email }})
        </li>
      </ul>
  `,
  styles: ``
})
export class P8RxjsComponent {

  users: any[] = [];

  usersUrl = 'https://jsonplaceholder.typicode.com/users';

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.fetchUsers();
  }

  fetchUsers(): void {
    this.http.get<any[]>(this.usersUrl).pipe(

      // Side-effect for debugging
      tap(data => console.log('Data fetched:', data)),

      catchError(error => {
        console.error('Error occurred', error);
        return of([]);
      })
    ).subscribe(data => {
      this.users = data;
    });
  }

}
