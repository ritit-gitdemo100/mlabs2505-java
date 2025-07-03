import { Component, inject } from '@angular/core';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-details',
  imports: [RouterModule],
  templateUrl: './product-details.component.html',
  styles: ``
})
export class ProductDetailsComponent {

  product:any;
  productService = inject(ProductService);
   
  constructor(private activatedRoute:ActivatedRoute){}

  ngOnInit(){
    const id:number = Number(this.activatedRoute.snapshot.paramMap.get("id") || 0);
    this.product = this.productService.getById(id);
  }
}
