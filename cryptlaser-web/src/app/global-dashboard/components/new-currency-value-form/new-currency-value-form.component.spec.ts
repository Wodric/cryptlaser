import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewCurrencyValueFormComponent } from './new-currency-value-form.component';

describe('NewCurrencyValueFormComponent', () => {
  let component: NewCurrencyValueFormComponent;
  let fixture: ComponentFixture<NewCurrencyValueFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewCurrencyValueFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewCurrencyValueFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
