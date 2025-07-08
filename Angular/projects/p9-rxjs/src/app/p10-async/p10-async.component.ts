import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-p10-async',
  imports: [CommonModule],
  template: `
    <table border='1' width='500px'>
      <tr><th>Name</th><th>Email</th></tr>
      <tr *ngFor="let user of users$ | async">
        <td>{{ user.name }} </td>
        <td> ({{ user.email }})</td>
      </tr>
    </table>
  `,
  styles: ``
})
export class P10AsyncComponent {

  users$: Observable<any[]>;

  constructor(private http: HttpClient) {
    this.users$ = this.http.get<any[]>('https://jsonplaceholder.typicode.com/users');
  }

}
