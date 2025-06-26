import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'grade'
})
export class GradePipe implements PipeTransform {

  transform(value: number): string {
    if (value >= 75) {
      return 'Distinction';
    } else if (value >= 60) {
      return 'First Class';
    } else if (value >= 50) {
      return 'Second Class';
    } else {
      return 'Nil';
    }
  }

}
