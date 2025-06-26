import { Component } from '@angular/core';
import { P1CaseComponent } from './p1-case/p1-case.component';
import { P2DateComponent } from './p2-date/p2-date.component';
import { P3DecimalComponent } from './p3-decimal/p3-decimal.component';
import { P4PercentComponent } from './p4-percent/p4-percent.component';
import { P5CurrencyComponent } from './p5-currency/p5-currency.component';
import { P6SliceComponent } from './p6-slice/p6-slice.component';
import { P7JsonComponent } from './p7-json/p7-json.component';
import { P9CustomComponent } from './p9-custom/p9-custom.component';
import { P8KeyValueComponent } from './p8-key-value/p8-key-value.component';



@Component({
  selector: 'app-root',
  imports: [
    P1CaseComponent,
    P2DateComponent,
    P3DecimalComponent,
    P4PercentComponent,
    P5CurrencyComponent,
    P6SliceComponent,
    P7JsonComponent,
    P8KeyValueComponent,
    P9CustomComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'p4-pipes';
}
