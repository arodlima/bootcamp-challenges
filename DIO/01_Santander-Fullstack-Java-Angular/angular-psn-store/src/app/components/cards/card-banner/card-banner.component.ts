import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-card-banner',
  templateUrl: './card-banner.component.html',
  styleUrls: ['./card-banner.component.css']
})
export class CardBannerComponent implements OnInit {

  @Input()
  photoBanner:string = ""

  constructor() { }

  ngOnInit(): void {
  }

}
