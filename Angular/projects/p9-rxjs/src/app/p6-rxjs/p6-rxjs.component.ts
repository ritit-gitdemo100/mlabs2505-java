import { Component } from '@angular/core';
import { of, map, filter } from 'rxjs';

@Component({
  selector: 'app-p6-rxjs',
  imports: [],
  template: `
    <p>
      p6-rxjs works!
    </p>
  `,
  styles: ``
})
export class P6RxjsComponent {

  ngOnInit() {
    
    // Create observable from numbers 1 to 5
    const numbers$ = of(1, 2, 3, 4, 5).pipe(
      map(num => num * 10),           
      filter(num => num > 20)         
    );

    // Subscribe to the observable
    numbers$.subscribe({
      next: val => console.log('Output:', val),
      complete: () => console.log('Done!')
    });
  }

}
