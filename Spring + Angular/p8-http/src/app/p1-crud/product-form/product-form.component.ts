import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ReactiveFormsModule, FormGroup, FormBuilder, Validators } from '@angular/forms';
import { RouterModule, Router, ActivatedRoute } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-form',
  imports: [CommonModule, ReactiveFormsModule, RouterModule],
  templateUrl: './product-form.component.html',
  styles: ``
})
export class ProductFormComponent {

  form: FormGroup;
  isEditMode = false;
  productId: number | null = null;

  constructor(
    private fb: FormBuilder,
    private productService: ProductService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.form = this.fb.group({
      name: ['', Validators.required],
      price: [0, [Validators.required, Validators.min(0)]],
    });
  }

  ngOnInit(): void {
    this.productId = Number(this.route.snapshot.paramMap.get('id'));
    this.isEditMode = !!this.productId;

    if (this.isEditMode) {
      this.productService.getProduct(this.productId).subscribe(product => {
        this.form.patchValue(product);
      });
    }
  }

  onSubmit(): void {
    const product: Product = {
      ...this.form.value,
      id: this.productId ?? 0,
    };

    const request = this.isEditMode
      ? this.productService.updateProduct(product)
      : this.productService.addProduct(product);

    request.subscribe(() => this.router.navigate(['/products']));
  }

}
