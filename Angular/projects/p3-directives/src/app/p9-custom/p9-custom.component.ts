import { Component } from '@angular/core';
import { PrimaryDirective } from '../customdirectives/primary.directive';

@Component({
  selector: 'app-p9-custom',
  imports: [PrimaryDirective],
  template: `
    <p appPrimary >
      p9-custom works!
    </p>
  `,
  styles: ``
})
export class P9CustomComponent {

}
