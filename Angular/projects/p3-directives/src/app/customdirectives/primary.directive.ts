import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appPrimary]'
})
export class PrimaryDirective {

  constructor(e:ElementRef) { 
    e.nativeElement.style.color = 'white';
    e.nativeElement.style.backgroundColor = 'blue';
  }

}
