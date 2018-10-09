import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewCurrencyFormComponent } from './new-currency-form.component';

describe('NewCurrencyFormComponent', () => {
  let component: NewCurrencyFormComponent;
  let fixture: ComponentFixture<NewCurrencyFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewCurrencyFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewCurrencyFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
