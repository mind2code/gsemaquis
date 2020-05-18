import { Component, OnInit } from '@angular/core';
import { MaquisService } from '../services/maquis.service';
import { Maquis } from '../models/maquis.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  maquis: Maquis[];

  constructor(private maquisService: MaquisService) { }

  ngOnInit() {
    this.maquisService.getMaquis().subscribe( result => {
      this.maquis = result;
      console.log(this.maquis);
    });
  }

}
