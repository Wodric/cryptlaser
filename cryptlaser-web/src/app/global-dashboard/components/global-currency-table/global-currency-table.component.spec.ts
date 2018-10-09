import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GlobalCurrencyTableComponent } from './global-currency-table.component';

describe('GlobalCurrencyTableComponent', () => {
  let component: GlobalCurrencyTableComponent;
  let fixture: ComponentFixture<GlobalCurrencyTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GlobalCurrencyTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GlobalCurrencyTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
