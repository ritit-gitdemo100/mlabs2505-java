import { ComponentFixture, TestBed } from '@angular/core/testing';

import { P1UserformComponent } from './p1-userform.component';

describe('P1UserformComponent', () => {
  let component: P1UserformComponent;
  let fixture: ComponentFixture<P1UserformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [P1UserformComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(P1UserformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the form with 2 controls', () => {
    expect(component.form.contains('name')).toBeTrue();
    expect(component.form.contains('email')).toBeTrue();
  });

  it('should mark form as invalid when fields are empty', () => {
    component.form.setValue({ name: '', email: '' });
    expect(component.form.valid).toBeFalse();
  });

  it('should mark form as valid with proper values', () => {
    component.form.setValue({ name: 'Alice', email: 'alice@example.com' });
    expect(component.form.valid).toBeTrue();
  });

  it('should invalidate email field if not a proper email', () => {
    component.form.controls['email'].setValue('invalid-email');
    expect(component.form.controls['email'].valid).toBeFalse();
  });

  it('should log form value on submit if valid', () => {
    spyOn(console, 'log');
    component.form.setValue({ name: 'Bob', email: 'bob@example.com' });
    component.submit();
    expect(console.log).toHaveBeenCalledWith('Form Submitted', { name: 'Bob', email: 'bob@example.com' });
  });

});
