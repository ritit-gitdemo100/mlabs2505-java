import { Component } from '@angular/core';
import { P1NgIfComponent } from './p1-ng-if/p1-ng-if.component';
import { P2NgIfComponent } from './p2-ng-if/p2-ng-if.component';
import { P3NgforComponent } from './p3-ngfor/p3-ngfor.component';
import { P4NgswitchComponent } from './p4-ngswitch/p4-ngswitch.component';
import { P5StyleComponent } from './p5-style/p5-style.component';
import { P6NgstyleComponent } from './p6-ngstyle/p6-ngstyle.component';
import { P7ClassComponent } from './p7-class/p7-class.component';
import { P8NgclassComponent } from './p8-ngclass/p8-ngclass.component';
import { P9CustomComponent } from './p9-custom/p9-custom.component';
import { P10NewComponent } from './p10-new/p10-new.component';

@Component({
  selector: 'app-root',
  imports: [
    P1NgIfComponent,
    P2NgIfComponent,
    P3NgforComponent,
    P4NgswitchComponent,
    P5StyleComponent,
    P6NgstyleComponent,
    P7ClassComponent,
    P8NgclassComponent,
    P9CustomComponent,
    P10NewComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'p3-directives';
}
