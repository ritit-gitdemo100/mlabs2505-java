import { Component } from '@angular/core';

@Component({
  selector: 'app-p9-optional',
  imports: [],
  template: `
    <p> p9-optional works!  </p>
    <p>User Name: {{ user?.name || 'Loading...' }}</p>
    <button (click)="loadUser()">Load User</button>

  `,
  styles: ``
})
export class P9OptionalComponent {

  user: { name: string } | null = null;

  loadUser() {
    setTimeout(() => {
      this.user = { name: 'Charlie' };
    }, 2000);
  }

}
