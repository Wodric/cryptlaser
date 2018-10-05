import { Component, OnInit, ViewChild, Input,
  OnChanges, SimpleChanges } from '@angular/core';
import { MatPaginator, MatSort } from '@angular/material';
import { GlobalCurrencyTableDataSource } from './global-currency-table-datasource';
import { CurrencyService } from '../../currency.service';
import { Currency } from '../../models/currency.interface';

@Component({
  selector: 'app-global-currency-table',
  templateUrl: './global-currency-table.component.html',
  styleUrls: ['./global-currency-table.component.css']
})
export class GlobalCurrencyTableComponent implements OnInit, OnChanges {
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;


  dataSource: GlobalCurrencyTableDataSource;

  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  displayedColumns = ['id', 'shortName', 'name'];

  @Input()
  currencyList: Currency[];

  constructor(private currencyService: CurrencyService) {
  }

  ngOnInit() {
    if (this.currencyList) {
      this.dataSource = new GlobalCurrencyTableDataSource(this.paginator, this.sort, this.currencyList);
    }
  }

  ngOnChanges(changes: SimpleChanges): void {
    if (changes.currencyList.currentValue) {
      this.dataSource = new GlobalCurrencyTableDataSource(this.paginator, this.sort, this.currencyList);
    }
}
}
