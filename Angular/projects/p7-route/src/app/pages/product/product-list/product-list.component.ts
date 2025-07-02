import { Component, inject } from '@angular/core';
import { ProductService } from '../../../services/product.service';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  imports: [CommonModule],
  templateUrl: './product-list.component.html',
  styles: ``
})
export class ProductListComponent {

    private productService = inject(ProductService);
    products = this.productService.getAll();
    
    constructor(private router:Router) {}

    goToProduct(id:number){
      console.log(id)
      this.router.navigate(['product/details',id]);
    }
}
