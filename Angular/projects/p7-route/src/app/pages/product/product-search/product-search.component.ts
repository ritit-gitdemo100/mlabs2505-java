import { Component, inject } from '@angular/core';
import { ProductService } from '../../../services/product.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-product-search',
  imports: [FormsModule, CommonModule],
  templateUrl: './product-search.component.html',
  styles: ``
})
export class ProductSearchComponent {

  productService = inject(ProductService);
  allProducts = this.productService.getAll();

  searchTerm : string = "";

  get products() {
    return this.allProducts.filter(p =>
      p.name.toLowerCase().includes(this.searchTerm.toLowerCase())
    );
  }

}
