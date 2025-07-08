import { Component } from '@angular/core';
import { interval } from 'rxjs';

@Component({
  selector: 'app-p2-observable',
  imports: [],
  template: `
    <p>
      Counter {{counter}}
    </p>
  `,
  styles: ``
})
export class P2ObservableComponent {

  counter = 0;

  ngOnInit() {
    interval(1000).subscribe(val => {
      this.counter = val;
    });
  }

}
